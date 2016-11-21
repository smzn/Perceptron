package perceptron;

public class Perceptron_lib {
	
	private int n;
	private double[] nu;
	private double theta, epsilon;
	
	public Perceptron_lib(int n, double[] nu, double theta, double epsilon) {
		this.n = n;
		this.nu = nu;
		this.theta = theta;
		this.epsilon = epsilon;
	}
	
	public double getOutput(double[] x){
		
		double y = 0, output;
		for(int i = 0; i < nu.length; i++){
			y += nu[i] * x[i];
		}
		if( y > theta) output = 1;
		else output = 0;
		
		return output;
	}
	
	public void getParameter(double[] x, double y){
		
		for(int i = 0; i < nu.length; i++){
			nu[i] += epsilon * (y - this.getOutput(x))*x[i]; 
		}
		
	}
	
}
