package org.strategoxt.imp.editors.template.generated;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.strc.*;
import org.strategoxt.imp.editors.template.generated.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Desugared_1_0 extends Strategy 
{ 
  public static $Desugared_1_0 instance = new $Desugared_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_32789)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Desugared_1_0");
    Fail1228:
    { 
      IStrategoTerm s_32963 = null;
      IStrategoTerm r_32963 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consDesugared_1 != ((IStrategoAppl)term).getConstructor())
        break Fail1228;
      r_32963 = term.getSubterm(0);
      IStrategoList annos33 = term.getAnnotations();
      s_32963 = annos33;
      term = q_32789.invoke(context, r_32963);
      if(term == null)
        break Fail1228;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consDesugared_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_32963));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}