package com.mycom.trainbooking.service;

import com.mycom.trainbooking.model.Train;

import java.util.List;

public interface TrainService {
    List<Train> getAllTrains();
    Train getTrainById(Long id);
    Train addTrain(Train train);
    void deleteTrain(Long id);
}
