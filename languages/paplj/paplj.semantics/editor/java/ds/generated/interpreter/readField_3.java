package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class readField_3 extends A_readField__Arrow 
{ 
  @Child public A_Obj _1;

  public String _2;

  public String _3;

  public readField_3 (INodeSource source, A_Obj _1, String _2, String _3) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
    this._2 = _2;
    this._3 = _3;
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
    final readField_3 other = (readField_3)obj;
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
    if(_3 == null)
    { 
      if(other._3 != null)
      { 
        return false;
      }
    }
    else
      if(!_3.equals(other._3))
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
      if(_1 instanceof IGenericNode)
      { 
        ((IGenericNode)_1).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_V exec_default(A_This _1, com.github.krukow.clj_ds.PersistentMap<String, A_V> _2, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _3, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _4)
  { 
    this.specializeChildren(0);
    final A_This this_in700 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in700 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in700 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in700 = _4;
    final A_Obj o2700000 = this._1;
    final String c4300000 = this._2;
    final String f2300000 = this._3;
    final A_This this_1700 = this_in700;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_1700 = env_in700;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_1600 = c_in700;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_1700 = store_in700;
    final lookupField_3 lifted_450000 = new lookupField_3(this.getSourceInfo(), o2700000, c4300000, f2300000);
    final R_default_Int $tmp19 = lifted_450000.exec_default(this_1700, env_1700, c_1600, store_1700);
    final int lifted_224000 = $tmp19.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_2500 = $tmp19.get_1();
    final read_1 lifted_440000 = new read_1(this.getSourceInfo(), lifted_224000);
    final R_default_V $tmp20 = lifted_440000.exec_default(this_1700, env_1700, c_1600, store_2500);
    final A_V lifted_226000 = $tmp20.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_3300 = $tmp20.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out700 = store_3300;
    final A_V result_out700 = lifted_226000;
    return new R_default_V(result_out700, store_out700);
  }

  public A_Obj get_1()
  { 
    return this._1;
  }

  public String get_2()
  { 
    return this._2;
  }

  public String get_3()
  { 
    return this._3;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("readField", 3), _1.toStrategoTerm(factory), factory.makeString(_2), factory.makeString(_3));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}