class FaceRunner {
	
	public static void main(String[] args){
		Face face1 = new Face("round", "brown","long");
		Face face2 = new Face("oval", "black","short");
		Face face3 = new Face("round", "yellow","long");
		Face face4 = new Face("oval", "brown","blunt");
		Face face5 = new Face("round", "black","long");
		
		System.out.println("Face 1 : (shape, eye-color, nose) : " + face1.shape +" , "+face1.eye +
		" , "+face1.nose);
		
		System.out.println("Face 2 : (shape, eye-color, nose) : " + face2.shape +" , "+face2.eye +
		" , "+face2.nose);
		
		System.out.println("Face 3 : (shape, eye-color, nose) : " + face3.shape +" , "+face3.eye +
		" , "+face3.nose);
		
		System.out.println("Face 4 : (shape, eye-color, nose) : " + face4.shape +" , "+face4.eye +
		" , "+face4.nose);
		
		System.out.println("Face 5 : (shape, eye-color, nose) : " + face5.shape +" , "+face5.eye +
		" , "+face5.nose);
	}
}