package by.teachmeskills.lessen10.task1;

public class MyCarException extends Exception{

    private String model;
    public MyCarException(String model){
        this.model=model;
    }
     public String getModel(){
        return model;
     }
     public void setModel(String model){
        this.model=model;
     }

    public MyCarException() {
    }
}
