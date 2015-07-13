package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class allocate_1 extends A_allocate__Arrow 
{ 
  @Child public A_V _1;

  public allocate_1 (INodeSource source, A_V _1) 
  { 
    this.setSourceInfo(source);
    this._1 = adoptChild(_1);
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
    final allocate_1 other = (allocate_1)obj;
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
      if(_1 instanceof IGenericNode)
      { 
        ((IGenericNode)_1).specialize(depth);
      }
      hasSpecialized = true;
    }
  }

  public R_default_Int exec_default(com.github.krukow.clj_ds.PersistentMap<String, A_V> _1, com.github.krukow.clj_ds.PersistentMap<String, A_Class> _2, com.github.krukow.clj_ds.PersistentMap<Integer, A_V> _3)
  { 
    this.specializeChildren(0);
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in26500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in26500 = _2;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in26500 = _3;
    final A_V v12000000 = this._1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_126800 = env_in26500;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_131700 = c_in26500;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_127100 = store_in26500;
    final int loc3600000 = ds.manual.interpreter.Natives.fresh();
    final write_2 lifted_17960000 = new write_2(this.getSourceInfo(), loc3600000, v12000000);
    final R_default_V $tmp538 = lifted_17960000.exec_default(env_126800, c_131700, store_127100);
    final A_V lifted_16960000 = $tmp538.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_219300 = $tmp538.get_1();
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out26500 = store_219300;
    final int result_out26500 = loc3600000;
    return new R_default_Int(result_out26500, store_out26500);
  }

  public A_V get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("allocate", 1), _1.toStrategoTerm(factory));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}