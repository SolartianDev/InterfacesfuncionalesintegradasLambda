package com.interfaceslamba.practica;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    // Clase que representa a un empleado
    private String primerNombre;
    private String segundoNombre;
    private int edad;
    private String deptLaboral;
    private String email;
    private Genero genero;
    private Rol rol;
    private double salario;
    private String telefono;
    private String direccion;
    private String departamento;
    private String ciudad;
  // Clase interna Builder para construir objetos Empleado de manera más flexible
    public static class Builder{
        private String primerNombre;
    private String segundoNombre;
    private int edad;
    private String deptLaboral;
    private String email;
    private Genero genero;
    private Rol rol;
    private String telefono;
    private String direccion;
    private String departamento;
    private String ciudad;
    private double salario;  //AGREGAMOS EL SALARIO
    // Métodos para configurar los atributos del empleado
        public Empleado.Builder salario(double salario) {  //METODO PARA CONFIGURAR ATRIBUTOS DE SALARIO
            this.salario = salario;
            return this;
        }

        public Empleado.Builder primerNombre(String primerNombre) {
            this.primerNombre = primerNombre;
            return this;
        }

        public Empleado.Builder segundoNombre(String segundoNombre) {
            this.segundoNombre = segundoNombre;
            return this;
        }

        public Empleado.Builder edad(int edad) {
            this.edad = edad;
            return this;
        }

        public Empleado.Builder deptLaboral(String deptLaboral) {
            this.deptLaboral = deptLaboral;
            return this;
        }

        public Empleado.Builder email(String email) {
            this.email = email;
            return this;
        }

        public Empleado.Builder genero(Genero genero) {
            this.genero = genero;
            return this;
        }

        public Empleado.Builder rol(Rol rol) {
            this.rol = rol;
            return this;
        }

        public Empleado.Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Empleado.Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Empleado.Builder departamento(String departamento) {
            this.departamento = departamento;
            return this;
        }

        public Empleado.Builder ciudad(String ciudad) {
            this.ciudad = ciudad;
            return this;
        }
        
    public Empleado build(){
        return new Empleado(this);
    }
    }
    // Constructor privado que toma un Builder como argumento
    private Empleado(Empleado.Builder builder){
       this.primerNombre = builder.primerNombre;
    this.segundoNombre= builder.segundoNombre;
    
    this.edad= builder.edad;
    this.deptLaboral = builder.deptLaboral;
    this.email = builder.email;
    this.genero= builder.genero;
    this.rol = builder.rol;
   this.telefono =  builder.telefono;
    this.direccion = builder.direccion;
    this.departamento = builder.departamento;
    this.ciudad = builder.ciudad;  
    this.salario = builder.salario;  //AGREGAMOS EL DE SALARIO
 
    }
// Métodos getter para obtener los atributos del empleado

    public double getSalario() {   // METODO GET DE SALARIO
        return salario;        
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDeptLaboral() {
        return deptLaboral;
    }

    public String getEmail() {
        return email;
    }

    public Genero getGenero() {
        return genero;
    }

    public Rol getRol() {
        return rol;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getCiudad() {
        return ciudad;
    }
    // Método para imprimir los detalles del empleado
    public void imprimir(){
        System.out.println(
        "\nNombre: "+getPrimerNombre()+" "+getSegundoNombre()+"\n"+
        "Edad: "+ getEdad()+"\n"+
        "Genero: "+ getGenero()+"\n"+
        "Rol: "+getRol()+"\n"+        
        "Departamento Laboral: "+getDeptLaboral()+"\n"+
        "Salario: " +getSalario()+"\n"+  //AGREGAMOS EL SALARIO
        "Email: " + getEmail()+"\n"+
        "Telefono: "+ getTelefono()+"\n"+
        "Direccion: "+ getDireccion()+"\n"+
        "Departamento: "+ getDepartamento()+"\n"+
        "Ciudad: "+getCiudad()+"\n");
               
    }
     //AGREGAMOS EL METODO GET-RESUMEN
    public String getResumen(){
        return
                "Nombre: "+getPrimerNombre() + " "+getSegundoNombre()+
                "Rol: "+ getRol()+
                "Departamento Laboral: "+getDeptLaboral()+
                "Email: " + getEmail()+
                "Salario" + getSalario();
        
    }
        // Método para obtener una representación en cadena del empleado
    @Override
    public String toString() {
        return "Nombre: " + "primerNombre=" + primerNombre+" " + segundoNombre + ", edad: " + edad + ", deptLaboral: " + deptLaboral +", Salario" + getSalario()+", email: " + email + ", genero: " + genero + ", rol: " + rol + ", telefono: " + telefono + ", direccion: " + direccion + ", departamento: " + departamento + ", ciudad: " + ciudad;
    } //tambien AGREGAMOS SALARIO AL METODO TOSTRING
    
    
    // Método estático para crear una lista de empleados predefinidos
    public static List<Empleado> crearLista(){
    List<Empleado> empleados = new ArrayList();
    
    empleados.add(new Empleado.Builder()
    .primerNombre("Andres")
    .segundoNombre("Gomez")
    .edad(23)
    .genero(Genero.MASCULINO)
    .rol(Rol.STAFF)
    .deptLaboral("Ingenieria")
    .salario(40000)
    .email("andres@email.com")
    .telefono("3126647312")
    .direccion("calle 26 # 35-46 sur")
            .departamento("Bogota DC")
            .ciudad("Bogota")
            .build());
            
    empleados.add(new Empleado.Builder()
    .primerNombre("Camila")
    .segundoNombre("Rodriguez")
    .edad(25)
    .genero(Genero.FEMENINO)
    .rol(Rol.STAFF)
    .deptLaboral("Ventas")
            .salario(45000)
    .email("camila@email.com")
    .telefono("3213446312")
    .direccion("calle 45 # 67-22")
    .departamento("Bogota DC")
    .ciudad("Bogota")
    .build());
    
    empleados.add(new Empleado.Builder()
    .primerNombre("John")
    .segundoNombre("Carvajal")
    .edad(28)
    .genero(Genero.MASCULINO)
    .rol(Rol.MANAGER)
    .deptLaboral("Recursos Humanos")
            .salario(65000)
    .email("john@email.com")
    .telefono("3229348566")
    .direccion("cra 123 # 12-14")
            .departamento("Antioquia")
            .ciudad("Medellin")
            .build());
    
    
    empleados.add(new Empleado.Builder()
    .primerNombre("Jaime")
    .segundoNombre("Bermudez")
    .edad(45)
    .genero(Genero.MASCULINO)
    .rol(Rol.MANAGER)
    .deptLaboral("Ingenieria")
            .salario(85000)
    .email("jaime@email.com")
    .telefono("3142678854")
    .direccion("calle 34 # 22-56 sur")
            .departamento("Santader")
            .ciudad("Santander")
            .build());
    
    
    empleados.add(new Empleado.Builder()
    .primerNombre("Gustavo")
    .segundoNombre("Velez")
    .edad(52)
    .genero(Genero.MASCULINO)
    .rol(Rol.MANAGER)
    .deptLaboral("Ventas")
            .salario(90000)
    .email("gustavo@email.com")
    .telefono("3125546466")
    .direccion("Calle 100 # 9-15")
            .departamento("Bogota DC")
            .ciudad("Bogota")
            .build());
    
    
    empleados.add(new Empleado.Builder()
    .primerNombre("Jorge")
    .segundoNombre("Jimenez")
    .edad(62)
    .genero(Genero.MASCULINO)
    .rol(Rol.EJECUTIVO)
    .deptLaboral("Ingenieria")
            .salario(120000)
    .email("jorge@email.com")
    .telefono("3224453221")
    .direccion("cra 54A # 12-40")
            .departamento("Bogota DC")
            .ciudad("Bogota")
            .build());
    
    empleados.add(new Empleado.Builder()
    .primerNombre("Andrea")
    .segundoNombre("Parra")
    .edad(55)
    .genero(Genero.FEMENINO)
    .rol(Rol.EJECUTIVO)
    .deptLaboral("Recursos Humanos")
            .salario(110000)
    .email("andrea@email.com")
    .telefono("3002938441")
    .direccion("cra 22 # 15-80 sur")
            .departamento("Valle del Cauca")
            .ciudad("Cali")
            .build());
    
    empleados.add(new Empleado.Builder()
    .primerNombre("Orlando")
    .segundoNombre("Vargas")
    .edad(65)
    .genero(Genero.MASCULINO)
    .rol(Rol.EJECUTIVO)
    .deptLaboral("Ventas")
            .salario(140000)
    .email("orlando@email.com")
    .telefono("3105578893")
    .direccion("calle 200 # 123-56")
            .departamento("Bogota DC")
            .ciudad("Bogota")
            .build());
    
    
    return empleados;
    
    
    }
    
    
}
