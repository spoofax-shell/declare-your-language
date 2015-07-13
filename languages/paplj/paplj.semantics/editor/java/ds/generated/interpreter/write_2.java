package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class write_2 extends A_write__Arrow 
{ 
  public int _1;

  @Child public A_V _2;

  public write_2 (INodeSource source, int _1, A_V _2) 
  { 
    this.setSourceInfo(source);
    this._1 = _1;
    this._2 = adoptChild(_2);
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
    final write_2 other = (write_2)obj;
    if(_1 != other._1)
    { 
      return false;
    }
    if(_2 == null)
    { 
      if(other._2 != null)
      { 
        return false;
      }
    }
    else
      if(!_2.equals(other._2))
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
      if(_2 instanceof IGenericNode)
      { 
        ((IGenericNode)_2).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in26600 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in26600 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in26600 = _3;
    final int loc3400000 = this._1;
    final A_V v11400000 = this._2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_126900 = env_in26600;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_131800 = c_in26600;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> S2300000 = store_in26600;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> lifted_17030000 = MapUtils.plus(S2300000, new com.github.krukow.clj_lang.PersistentTreeMap<Integer, A_V>().plus(loc3400000, v11400000));
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out26600 = lifted_17030000;
    final A_V result_out26600 = v11400000;
    return new R_default_V(result_out26600, store_out26600);
  }

  public int get_1()
  { 
    return this._1;
  }

  public A_V get_2()
  { 
    return this._2;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("write", 2), factory.makeInt(_1), _2.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}