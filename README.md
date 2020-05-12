# MathLanguage compiler

#Установка
  - Скачайте данный репозиторий
  - Откройте проект в IDE c установленным Antlr4 плагином
  
#Запуск
  - Запустите Main.java (аргументом должен подаваться файл с кодом на языке MathLanguage, по умолчанию - test1.math)
  - В результате выполнения программы исходный код из файла test1.math будет преобразован в код на языке Java, хранящийся по пути:
 (project_directory)/compiled/scr/result/Main.java
   - Получившийся код будет выполнен и вы увидите результат работы программы test1

#Грамматика
 - Была реализована грамматика языка, описывающего математические вычисления
 - Файл граматики хранится по пути: (project_directory)/scr/main/java/compiler/grammar/mathGrammar.g4

# Демо

## test1.math: 
```
   fun integer fExample (integer data) {
       data=data+1
       return data
   }
   
   main {
     integer kek = 9
     float bob = 3.22
   
     const integer mops = 2727
   
     integer a = 0
     integer b = 5
   
     integer dod = (integer) bob
   
     a = ((kek*dod)/mops + 123^2 - mops%2)-1
     print a
   
     a = fExample(a)
     print a
   
     float jija = bob + 2.28
   
     if (jija>=bob){
     print jija
     }
     else{
     print bob
     }
   
     while (b>0){
     b=b-1
     print b
     }
   
     for (b=0; b<5; b++){
     a=b
     print a
     }
   
   
   
   }
```
## Сгенерированный Main.java: 
```java
package result;
public class Main {
private static int fExample(int data){
data=data+1;
return data;
}
public static void main(String[]args) throws Exception{
int kek = 9;
float bob = 3.22f;
final int mops = 2727;
int a = 0;
int b = 5;
int dod = (int)bob;
a=((kek*dod)/mops+123^2-mops %2)-1;
System.out.println(a);
a=fExample(a);
System.out.println(a);
float jija = bob+2.28f;
if (jija>=bob){
System.out.println(jija);
}else{
System.out.println(bob);
}
while (b>0){
b=b-1;
System.out.println(b);
}
for (b=0; b<5; b++){
a=b;
System.out.println(a);
}
}
}


```

# Приятного использования!
