//Write a program to accept a line and check how many consonants and vowels are there in line.

//ASCII Values of Small Letters - 97 to 122
//ASCII Values of Capital Letters - 65 to 90

import java.util.Scanner;

public class L4_2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          short c=0,v=0,i;
          System.out.println("Enter Line :");
          String s = sc.nextLine();
          for(i=0;i<s.length();i++){
               if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'
               || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                    v++;
               }
               else if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122) && 
               (s.charAt(i)!='a' || s.charAt(i)!='e' || s.charAt(i)!='i' || s.charAt(i)!='o' || s.charAt(i)!='u'
               || s.charAt(i)!='A' || s.charAt(i)!='E' || s.charAt(i)!='I' || s.charAt(i)!='O' || s.charAt(i)!='U')){
                    c++;
               }
          }
          System.out.println("\nVowels - "+v+"\nConsonants - "+c);
          sc.close();
     }
}

/*
     Character   ASCII Code
     ---------------------
     (space)     32
     !           33
     "           34
     #           35
     $           36
     %           37
     &           38
     '           39
     (           40
     )           41
     *           42
     +           43
     ,           44
     -           45
     .           46
     /           47
     0           48
     1           49
     2           50
     3           51
     4           52
     5           53
     6           54
     7           55
     8           56
     9           57
     :           58
     ;           59
     <           60
     =           61
     >           62
     ?           63
     @           64
     A           65
     B           66
     C           67
     D           68
     E           69
     F           70
     G           71
     H           72
     I           73
     J           74
     K           75
     L           76
     M           77
     N           78
     O           79
     P           80
     Q           81
     R           82
     S           83
     T           84
     U           85
     V           86
     W           87
     X           88
     Y           89
     Z           90
     [           91
     \           92
     ]           93
     ^           94
     _           95
     `           96
     a           97
     b           98
     c           99
     d           100
     e           101
     f           102
     g           103
     h           104
     i           105
     j           106
     k           107
     l           108
     m           109
     n           110
     o           111
     p           112
     q           113
     r           114
     s           115
     t           116
     u           117
     v           118
     w           119
     x           120
     y           121
     z           122
     {           123
     |           124
     }           125
     ~           126
*/