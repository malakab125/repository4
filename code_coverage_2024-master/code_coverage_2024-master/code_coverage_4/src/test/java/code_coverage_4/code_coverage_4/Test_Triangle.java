package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_Triangle {
Triangle_classifacation triangle = new Triangle_classifacation();
	
	
	@Test
	  public void Test_1() {
	       int a = 7;
	       int b = 3;
	       int c = 16;
	       String expected = "Nottriangle";
	       String result = triangle.Triangle(a, b, c);
	       assertEquals(result , expected);
	    }
	 
	  @Test
	    public void Test_2() {
	        int a = 2;
	        int b = 4;
	        int c = 1;
	        String expected = "Nottriangle";
	        String result = triangle.Triangle(a, b, c);
	        assertEquals(result , expected);
	    }

	    @Test
	    public void Test_3() {
	        int a = 8; 
	        int b = 3;
	        int c = 2;
	        String expected = "Nottriangle";
	        String result =triangle.Triangle(a, b, c);
	        assertEquals(result , expected);
}
	@Test  
		public void Test_4(){
			int a = 7;
			int b = 7;
			int c=7;
			String expected ="equilateral";
			String result = triangle.Triangle(a, b, c);
			assertEquals(result , expected);
    }
	    @Test
	    public void Test_5() {
	        int a = 4;
	        int b = 4;
	        int c = 6;
	        String expected ="isosceles";
	        String result = triangle.Triangle(a, b, c);
	        assertEquals(result , expected);
	    }
	    @Test
	    public void Test_6() {
	        int a = 5;
	        int b = 3;
	        int c = 3;
	        String expected = "isosceles";
	        String result = triangle.Triangle(a, b, c);
	        assertEquals(result , expected);
	    }
	    @Test
	    public void Test_7() {
	        int a = 8;
	        int b = 5;
	        int c = 8;
	        String expected = "isosceles";
	        String result = triangle.Triangle(a, b, c);
	        assertEquals(result , expected);
	    }
	   
	    @Test
	    public void Test_8() {
	        int a = 8;
	        int b = 11;
	        int c = 15;
	        String expected = "Scalene";
	        String result = triangle.Triangle(a, b, c);
	        assertEquals(result , expected);
	    }

}
