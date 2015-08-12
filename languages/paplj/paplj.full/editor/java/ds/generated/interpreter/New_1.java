package ds.generated.interpreter;

import org.metaborg.meta.interpreter.framework.*;
import org.spoofax.interpreter.terms.*;
import com.github.krukow.clj_lang.PersistentTreeMap;

@SuppressWarnings("unused") public class New_1 extends A_Expr 
{ 
  public String _1;

  public New_1 (INodeSource source, String _1) 
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
    final New_1 other = (New_1)obj;
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
    final A_This this_in22500 = _1;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_in30500 = _2;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_in30500 = _3;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_in30500 = _4;
    final String c16800000 = this._1;
    final A_This this_123500 = this_in22500;
    final com.github.krukow.clj_ds.PersistentMap<String, A_V> env_131200 = env_in30500;
    final com.github.krukow.clj_ds.PersistentMap<String, A_Class> c_136600 = c_in30500;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_131200 = store_in30500;
    final loadClass_1 lifted_19150000 = new loadClass_1(this.getSourceInfo(), c16800000);
    final R_default_Class $tmp635 = lifted_19150000.exec_default(this_123500, env_131200, c_136600, store_131200);
    final A_Class lifted_2096000 = $tmp635.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_222700 = $tmp635.get_1();
    final initObject_1 lifted_19140000 = new initObject_1(this.getSourceInfo(), lifted_2096000);
    final R_default_Obj $tmp636 = lifted_19140000.exec_default(this_123500, env_131200, c_136600, store_222700);
    final A_Obj lifted_2099000 = $tmp636.value;
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_314600 = $tmp636.get_1();
    final o2v_1 lifted_2098000 = new o2v_1(this.getSourceInfo(), lifted_2099000);
    final com.github.krukow.clj_ds.PersistentMap<Integer, A_V> store_out30500 = store_314600;
    final A_V result_out30500 = lifted_2098000;
    return new R_default_V(result_out30500, store_out30500);
  }

  public String get_1()
  { 
    return this._1;
  }

  @Override public IStrategoTerm toStrategoTerm(ITermFactory factory)
  { 
    IStrategoAppl term = factory.makeAppl(factory.makeConstructor("New", 1), factory.makeString(_1));
    if(getSourceInfo() != null)
    { 
      getSourceInfo().apply(term);
    }
    return term;
  }
}