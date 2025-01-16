package code_coverage_4.code_coverage_4;

public class Triangle_classifacation {
	enum Triangle_Types {
		equilateral,
		isosceles,
		Scalene,
		Nottriangle,
		ERROR
	}
		public  String  Triangle(int a, int b, int c) {

			String triangle =  Triangle_Types.Nottriangle.toString();
			if (c < a+b) {
				if (b < a+c) {
					if (a < b+c) {
						if(a == b) {
							if (b == c) {
								triangle =  Triangle_Types.equilateral.toString();
								return triangle;

							}
							if (a==b) {
								triangle =  Triangle_Types.isosceles.toString();
							}
							else if  (b == c) {
								triangle =  Triangle_Types.isosceles.toString();
							}
							else if (a == c) {
								triangle =  Triangle_Types.isosceles.toString();
							}
							else 
								triangle =  Triangle_Types.Nottriangle.toString();

						}
					}
				}
			}
			return triangle;

		}

}
