use TripDetails;
 CREATE TABLE TripDetails (
    TripID INT PRIMARY KEY,
    DriverName VARCHAR(255) NOT NULL,
    VehicleNumber VARCHAR(10) NOT NULL,
    DateTime DATETIME NOT NULL,
    StartingKilometer INT NOT NULL,
    EndingKilometer INT NOT NULL
);
select * from TripDetails;