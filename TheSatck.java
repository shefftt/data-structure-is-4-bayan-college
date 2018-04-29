/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thesatck;

/**
 *
 * @author shefftt
 */
public class TheSatck {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//         تعريف حجم الاستاك او المصفوفه الخاصه بنا وهى نصوص اى اسماء واشياء من هذا القبيل والحجم عشرة خانات
        String names[] = new String[10];
        
        
        //انشاء كائن من الكلاس وهو الذى يحتوى على كل الدوال التى تتعامل مع الاستاك
        op o = new op();
        
        /*
        * push method 
        * الداله اعلاه تقوم باخذ قيمتين القيمه الاولى هى عبارة عن الاسم والقيمه الثانيه عبارة عن اسم الاستاك 
        * لانو نحن ادينا الاستاك بتاعنا اسم فوق نفس الاسم بنمررو للداله 
        * طبعا انت ممكن تحل المشكلة بشكل مختلف بس الحل بتاعنا 
        */
        o.push("ali", names);
        o.push("ahmed", names);
        o.push("ahmed 2", names);
        o.push("ahmed 3", names);
        o.push("ahmed 4", names);
        
        
        
        /*
        * جلقه تكراريه تقوم بطباعهكافه قيم المصفوفه
        */
        for(int i =0; i < names.length; i++){
            System.out.println(names[i]);
        }

        
    }
    
    
    
}
