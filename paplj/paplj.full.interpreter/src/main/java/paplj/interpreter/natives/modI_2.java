package paplj.interpreter.natives;

import org.metaborg.meta.lang.dynsem.interpreter.nodes.building.TermBuild;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.source.SourceSection;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;

@NodeChildren({ @NodeChild(value = "left", type = TermBuild.class),
                @NodeChild(value = "right", type = TermBuild.class) })
public abstract class modI_2 extends TermBuild {

    public modI_2(SourceSection source) {
        super(source);
    }

	@Specialization
	public int doInt(int left, int right) {
		return left % right;
	}

	public static TermBuild create(SourceSection source, TermBuild left,
			TermBuild right) {
		return modI_2NodeGen.create(source, left, right);
	}
}
