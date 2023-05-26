public class manosALaObra {
    /*
    operaciones aritméticas
     */
    public static void main (String[] args)
    {
        int dato1,dato2,resultado;
        dato1 = 20;
        dato2 = 10;
        String name1,name2,resulnames;
        name1 = "Lina";
        name2 = "Marcela";
        double number1,number2,resulnumbers;
        number1 = 4.5;
        number2 = 5.2;

        //Suma
        resultado = dato1 + dato2;
        System.out.println(dato1 + "+" + dato2 + "=" + resultado);
        //Rest
        resultado = dato1 - dato2;
        System.out.println(dato1 + "-" + dato2 + "=" + resultado);
        //Product
        resultado = dato1 * dato2;
        System.out.println(dato1 + "*" + dato2 + "=" + resultado);
        //Division
        resultado = dato1 * dato2;
        System.out.println(dato1 + "/" + dato2 + "=" + resultado);
        //name complete
        resulnames = name1 + name2;
        System.out.println(name1 + "+" + name2 + "=" + resulnames);
        //double numbers
        resulnumbers = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + resulnumbers);

                //name without spaces
        System.out.print("hello ");
        System.out.println("word");

        //Exercises 4 MAO=Let´s do it
        int age;
        age = 27;
        String name,surname,fullname;
        name = "Lina";
        surname = "Marcela";

        fullname = name + surname;
        System.out.println("my name is:" + name + " " + surname);
        System.out.println("my age is:" + age);


    }
}
