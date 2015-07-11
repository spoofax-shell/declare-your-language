package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class read_1 extends A_read__Arrow 
{ 
  public int _1;

  public read_1 (INodeSource source, int _1) 
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
    final read_1 other = (read_1)obj;
    if(_1 != other._1)
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
    final A_This this_in4000 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in4000 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in4000 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in4000 = _4;
    final int loc1000000 = this._1;
    final A_This this_14000 = this_in4000;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_13900 = env_in4000;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_14000 = c_in4000;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> S700000 = store_in4000;
    final A_V lifted_460000 = S700000.get(loc1000000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out4000 = S700000;
    final A_V result_out4000 = lifted_460000;
    return new R_default_V(result_out4000, store_out4000);
  }

  public int get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("read", 1), factory.makeInt(_1));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}