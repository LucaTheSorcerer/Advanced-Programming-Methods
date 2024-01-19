package org.example.Proxy;

public class DPRCIVProxy implements Police {

    private DPRCIV dprciv = new DPRCIV();

    @Override
    public void registerPlate(String plateNumber) {
        //Validate plate number
        if(plateNumber.contains("xxx")) {
            throw new RuntimeException("Plate number should not contain xxx");
        }
        dprciv.registerPlate(plateNumber);
    }
}
