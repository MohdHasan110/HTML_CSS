interface Bank{  
float rateOfInterest();  
}  
class SBI implements Bank{  
public float rateOfInterest(){return 9.15f;}  
}  
class BOI implements Bank{  
public float rateOfInterest(){return 9.7f;}  
} 
class ICICI implements Bank{  
public float rateOfInterest(){return 9.8f;}  
}  
class program_11{  
public static void main(String[] args){  
Bank b=new SBI();  
Bank b1=new BOI();  
Bank b2=new ICICI();  
System.out.println("ROI: "+b.rateOfInterest());  
System.out.println("ROI: "+b1.rateOfInterest());  
System.out.println("ROI: "+b2.rateOfInterest());  
}
} 