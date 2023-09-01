package inheritance;

public class BaseClass {

    public int baseNumber;

    //open field
    public String publicField = "BaseClass.publicField";

    //close field
    private String privateField = "BaseClass.privateField";

    //protected field
    protected String protectedField = "BaseClass.protectedField";

    public BaseClass(){}

    public BaseClass(int baseNumber){
        this.baseNumber = baseNumber;
    }

    //create method
    public void show(){
        System.out.println(privateField);
    }

}
