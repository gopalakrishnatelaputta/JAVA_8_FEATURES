package SessionJava8Practice;

public interface ConstructorReference1 
{
	Message getMessage(String msg);
}
class Message
{
	Message (String msg)
	{  
        System.out.print(msg);  
    }  
}  
class ConstructorReference 
{  
    public static void main(String[] args) 
    {  
    	ConstructorReference1 hello = Message::new;  
        hello.getMessage("Hello");  
    }  
}