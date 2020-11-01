package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-11-01T18:02:49.240Z[GMT]")
@Controller
public class ReadyApiController implements ReadyApi {

    private static final Logger log = LoggerFactory.getLogger(ReadyApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ReadyApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> getReadyMessage() {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }

}
