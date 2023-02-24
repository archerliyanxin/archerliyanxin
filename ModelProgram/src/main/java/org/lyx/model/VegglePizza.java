package org.lyx.model;

public class VegglePizza extends Pizza{
    public VegglePizza(String name){
        super.setName(name);
    }
    public  void prepare(){
        System.out.println("lyx 开始准备了" + super.getName());
    }
    public  void bake(){
        System.out.println("lyx小厨神 开始烘烤"+ super.getName());
    }
    public  void cut(){
        System.out.println("lyx 开始为切菜了" + super.getName());
    }
    public  void box(){
        System.out.println("lyx 把开始打包了" + super.getName());
    }
}
