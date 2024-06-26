package com.oocode;

import com.oneeyedmen.okeydoke.Approver;
import com.oneeyedmen.okeydoke.junit5.ApprovalsExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.io.File;

public class ExampleApprovalTest {
    @RegisterExtension
    ApprovalsExtension approvals = new ApprovalsExtension(new File("src/test/resources/approval"));

    @Test
    public void shouldProduceExpectedOutput(Approver approver) {
        approver.assertApproved("Mary had a little lamb");
    }
}
