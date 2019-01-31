package com.apress.controller;

import com.apress.domain.Poll;
import com.apress.repository.PollRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


// Because we need to read and store Poll instances, we use the @Inject annotation
// to inject an instance of PollRepository into our controller.
@RestController
public class PollController {

    //A GET request on the /polls endpoint provides a collection of all of the polls
    // available in the QuickPolls application.

    //The @RequestMapping annotation declares the URI and the allowed HTTP method.
    @RequestMapping(value="/polls", method= RequestMethod.GET)
    public ResponseEntity<Iterable<Poll>> getAllPolls() {

        // The method implementation begins with reading all of the polls
        // using the PollRepository.
        Iterable<Poll> allPolls = pollRepository.findAll();

        // The getAllPolls method used ResponseEntity as its return type,
        // indicating that the return value is the complete HTTP response.
        // ResponseEntity gives you full control over the HTTP response,
        // including the response body and response headers.
        return new ResponseEntity<Iterable<Poll>>(pollRepository.findAll(), HttpStatus.OK);

        // We then create an instance of ResponseEntity and pass in Poll data
        // and the HttpStatus.OK status value. The Poll data becomes part of the
        // response body and OK (code 200) becomes the response status code.
    }

    @Autowired
    private PollRepository pollRepository;

}