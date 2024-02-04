public class Teacher {
    String name,gender;
    int age;
    // for constructor
    // we don't need to call a methood by using constructor
    // it's a special type of methood that is used to initialize the object 
    Teacher(String n,String m,int a ){
        name = n;
        gender = m;
        age = a;


    }




// paramitarized methood
   /*void setInformation(String n,String m,int a){
        name = n;
        gender = m;
        age = a;



    }
    */

   // using a methood in class without parameter

   void displayInformation(){
       System.out.println("Name :"+ name + ", Gender :" + gender + ", Age" + age );
        System.out.println("\n\n");
    }
    // witout return type

}
