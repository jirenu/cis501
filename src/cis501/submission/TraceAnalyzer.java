package cis501.submission;

import cis501.ITraceAnalyzer;
import cis501.Insn;

public class TraceAnalyzer implements ITraceAnalyzer {
    private double[] numInsns;
    @Override
    public String author() {
        return "Jishnu Renugopal";
    }

    @Override
    public void run(Iterable<Insn> iiter) {
	   numInsns = new double[5];  
	   for (Insn insn : iiter) {
            // TODO: your code here
        }
    }

    @Override
    public double avgInsnSize() {
         double num = numInsns[0]+numInsns[1]+numInsns[2]+numInsns[3]+numInsns[4];
	 double total = 0; 
	 return total/num;
    }

    @Override
    public double insnBandwidthIncreaseWithoutThumb() {
        return 1.0;
    }

    @Override
    public String mostCommonInsnCategory() {
	double max = numInsns[0];
	String commonInsn = "load";
	for(int i=0;i<numInsns.length;i++)
	{
		if()
	}
        return null;
    }

    @Override
    public double fractionOfDirectBranchOffsetsLteNBits(int bits) {
        return 0;
    }

}
