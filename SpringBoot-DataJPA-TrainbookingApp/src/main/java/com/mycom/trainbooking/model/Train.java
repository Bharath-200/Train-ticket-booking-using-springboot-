package com.mycom.trainbooking.model;

import javax.persistence.*;

@Entity
@Table(name = "trains")
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "train_no")
    private String trainNo;

    @Column(name = "train_name")
    private String trainName;

    @Column(name = "from_station")
    private String fromStation;

    @Column(name = "to_station")
    private String toStation;

    // Constructors, getters, setters, and toString methods omitted for brevity



    
    
    public Train() {}
    

    public Train(Long id, String trainNo, String trainName, String fromStation, String toStation) {
		super();
		this.id = id;
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.fromStation = fromStation;
		this.toStation = toStation;
	}

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}
	@Override
    public String toString() {
        return "Train{" +
        		"trainNo='" + trainNo + '\'' + 
        		"trainName='"+ trainName + '\'' +
                "fromStation='" + fromStation + '\'' +
                ", toStation='" + toStation + '\'' +
                '}';
    }
}

    

