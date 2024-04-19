class constructor3 {
    int i;
    String name;
    constructor3(int i, String name){
        this.i=i;
        this. name=name;
    } 
    public static void main(String[] args) {
        constructor3 e1=new constructor3(123,"Rahul");
        System.out.println(e1.i+" "+e1.name);
        constructor3 e2 =new constructor3(434, "hello");
        System.out.println(e2.i+" "+e2.name);

    }

    
}
