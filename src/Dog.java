public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Dog(){

    }
    public void bark(String woof){
        System.out.println("Woof");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public static void main(String[]args){
        Dog tom=new Dog("Jery",4);
        tom.setAge(5);
        tom.bark("woof");
        System.out.println("Age Jery-"+tom.getAge()+"years");

    }
}

