����   C S
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  Enter the string: 
      java/io/PrintStream println (Ljava/lang/String;)V
     ! next ()Ljava/lang/String;
 # $ % & ' Demo026 countVowels (Ljava/lang/String;)I
 # ) * ' countConsonants   , - . makeConcatWithConstants (I)Ljava/lang/String;  ,
 1 2 3 4 ! java/lang/String toLowerCase
 1 6 7 8 toCharArray ()[C Code LineNumberTable main ([Ljava/lang/String;)V StackMapTable ? [C 
SourceFile Demo026.java BootstrapMethods D 	Vowels:  F Consonants:  H
 I J K - L $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses O %java/lang/invoke/MethodHandles$Lookup Q java/lang/invoke/MethodHandles Lookup ! #           9        *� �    :        	 ; <  9   q     =� Y� 	� L� � +� M,� ">,� (6� � +  � � � /  � �    :   "            	 # 
 /  <  	 & '  9   �     J<*� 0� 5M,�>6� 5,46a� e� i� o� 
u� ������    :            ?  B  H  =    �   1 >  � .� �  	 * '  9   �     X<*� 0� 5M,�>6� C,46a� 0z� )a� "e� i� o� u� ������    :            M  P  V  =    �   1 >  ?�   @    A B     G  C G  E M   
  N P R 