package trans;

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

@SuppressWarnings("all") final class lifted576 extends Strategy 
{ 
  TermReference r_33014;

  TermReference s_33014;

  TermReference q_33014;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2071:
    { 
      term = aux_$Declaration_0_3.instance.invoke(context, term, r_33014.value, s_33014.value, q_33014.value);
      if(term == null)
        break Fail2071;
      if(true)
        return term;
    }
    return null;
  }
}