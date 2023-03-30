package java8;

import java.util.Base64;

public class Encoder_Decoder 
{
	
	void Encoder()
	{
		Base64.Encoder en=Base64.getEncoder();
		byte byteArr []= {1,2,3,4};
		
		System.out.print("Before Encoding Byte Array is  :  ");
		for (byte b : byteArr) 
		{
			System.out.print(b+" ");
			
		}
		System.out.println();
		byte byteArr2 []=en.encode(byteArr);
		System.out.println("Encoded byte Array is  :"+byteArr2);
		byte ByteArr3 []=new byte [100];
		int x=en.encode(byteArr, ByteArr3);
		System.out.println("Encoded byte Array Written into Another Byte Array"+ByteArr3);
		System.out.println("Number of bytes Written :"+x);
		System.out.println("=============================================");
		//STRING ENCODING
		
		String str=en.encodeToString("Gopala Krishna".getBytes());
		System.out.println("Encoded String is  :"+str);
		
		
	
	
		Base64.Decoder de=Base64.getDecoder();
		String dStr=new String(de.decode(str));
		System.out.println("Decoded String is :"+dStr);
	
	
	}
	
	public static void main(String[] args) 
	{
		
		Encoder_Decoder ed=new Encoder_Decoder();
		ed.Encoder();
		
	}

}
