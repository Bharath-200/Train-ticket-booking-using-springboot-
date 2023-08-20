package com.mycom.trainbooking.controller;

import com.mycom.trainbooking.model.Train;

import com.mycom.trainbooking.service.TrainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins="http://localhost:3000")

@RestController
@RequestMapping("/trains")
public class TrainController {
    private final TrainService trainService;

    @Autowired
    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @GetMapping("getalltrains")
    public ResponseEntity<List<Train>> getAllTrains() {
        List<Train> trains = trainService.getAllTrains();
        return new ResponseEntity<>(trains, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Train> getTrainById(@PathVariable("id") Long id) {
        Train train = trainService.getTrainById(id);
        return new ResponseEntity<>(train, HttpStatus.OK);
    }

    @PostMapping("/addtrain")
    public ResponseEntity<?> createTrain(@RequestBody Train train) {
        Train createdTrain = trainService.addTrain(train);
        return new ResponseEntity<>(createdTrain, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrain(@PathVariable("id") Long id) {
        trainService.deleteTrain(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
