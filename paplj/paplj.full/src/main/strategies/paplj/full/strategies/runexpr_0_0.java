package paplj.full.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

import ds.generated.interpreter.Generic_A_Expr;

public class runexpr_0_0 extends Strategy {

	public static runexpr_0_0 instance = new runexpr_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm program) {
		context.getIOAgent().printError("runexpr: " + program);
		return new Generic_A_Expr(null, program).exec_init().toStrategoTerm(context.getFactory());
	}
}
