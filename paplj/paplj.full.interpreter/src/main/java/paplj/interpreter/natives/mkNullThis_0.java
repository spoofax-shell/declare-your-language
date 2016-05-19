package paplj.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.source.SourceSection;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChild
public abstract class mkNullThis_0 extends TermBuild {

    public mkNullThis_0(SourceSection source) {
        super(source);
    }

    @Specialization
    public int doInt(String s) {
        return Integer.parseInt(s);
    }

    public static TermBuild create(SourceSection source) {
        return mkNullThis_0NodeGen.create(source);
    }
}
