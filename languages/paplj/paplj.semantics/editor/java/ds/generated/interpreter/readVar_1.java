package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class readVar_1 extends A_readVar__Arrow 
{ 
  public String _1;

  public readVar_1 (INodeSource source, String _1) 
  { 
    this.setSourceInfo(source);
    this._1 = _1;
  }

  @Override public boolean equals(Object obj)
  { 
    if(this == obj)
    { 
      return true;
    }
    if(obj == null)
    { 
      return false;
    }
    if(getClass() != obj.getClass())
    { 
      return false;
    }
    final readVar_1 other = (readVar_1)obj;
    if(_1 == null)
    { 
      if(other._1 != null)
      { 
        return false;
      }
    }
    else
      if(!_1.equals(other._1))
      { 
        return false;
      }
    return true;
  }

  private boolean hasSpecialized;

  @Override public void specializeChildren(int depth)
  { 
    if(!hasSpecialized)
    { 
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in3600 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in3600 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in3600 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in3600 = _4;
    final String x1900000 = this._1;
    final A_This this_13600 = this_in3600;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> E900000 = env_in3600;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_13600 = c_in3600;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_13700 = store_in3600;
    final A_V lifted_420000 = E900000.get(x1900000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out3600 = store_13700;
    final A_V result_out3600 = lifted_420000;
    return new R_default_V(result_out3600, store_out3600);
  }

  public String get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("readVar", 1), factory.makeString(_1));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}