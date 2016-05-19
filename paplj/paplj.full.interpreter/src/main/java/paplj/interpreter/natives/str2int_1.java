package paplj.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.source.SourceSection;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChild(value = "string", type = TermBuild.class)
public abstract class str2int_1 extends TermBuild {

    public str2int_1(SourceSection source) {
        super(source);
    }

    @Specialization
    public int doInt(String s) {
        return Integer.parseInt(s);
    }

    public static TermBuild create(SourceSection source, TermBuild string) {
        return str2int_1NodeGen.create(source, string);
    }
}
