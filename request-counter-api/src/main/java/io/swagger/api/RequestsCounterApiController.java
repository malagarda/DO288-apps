package io.swagger.api;

import io.swagger.model.CounterMessage;
import io.swagger.model.ErrorModel;
import io.swagger.model.Request;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-08T08:00:53.858Z[GMT]")
@Controller
public class RequestsCounterApiController implements RequestsCounterApi {

    private static int counter = 0;

    private static final Logger log = LoggerFactory.getLogger(RequestsCounterApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RequestsCounterApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CounterMessage> addRequest(@ApiParam(value = ""  )  @Valid @RequestBody Request body) {
        try {
            return new ResponseEntity<CounterMessage>(objectMapper.readValue("{\n  \"numberOfRequests\" : " + ++counter + "\n}", CounterMessage.class), HttpStatus.OK);
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<CounterMessage>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<CounterMessage> getNumberOfRequests() {
        try {
            return new ResponseEntity<CounterMessage>(objectMapper.readValue("{\n  \"numberOfRequests\" : " + counter + "\n}", CounterMessage.class), HttpStatus.OK);
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<CounterMessage>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
