/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thesatck;

/**
 *
 * @author shefftt
 * سوف يتم تعريف جميع العمليات على المكدسه داخل هذا الكلاس 
 * اول عمليه هى عمليه الاضافه داخل المكدسه وتسمى 
 * push 
 * قمنا باضافة داله باسم العلميه
 */
public class op {
    
    // يعبر هذا عن حالة المكدسه هل هى فارغه ام مليانه
    public  int stackpointer = -1;
    
    
    // عمليه الاضافة تقبل العنصر واسم المصفوفه او الاستاك
    public void push(String name , String names[]){
        
        // التحقق اذا كان المؤشر اكبر من حجم المصفوفه او يساويها اذن مامكن اضيف عنصر ذياده للمصفوفه
        if(this.stackpointer < 10 ){
           
            names[++stackpointer] = name;
        }
    }
}
