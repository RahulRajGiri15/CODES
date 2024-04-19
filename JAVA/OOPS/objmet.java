class objmet {
    String color;
    int age;
    void objcre(String c, int a){
        color = c;
        age=a;
    }
    void display(){
        System.out.println(color+" "+age);
    }
    public static void main(String[] args) {
        System.out.println("1");
    
        objmet cat=new objmet();
        cat.objcre("green",10);
        cat.display();
    }
}