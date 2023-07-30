package cc.bitky.jetbrains.plugin.universalgenerate.action.action;

import cc.bitky.jetbrains.plugin.universalgenerate.action.action.base.AbstractBitkylinUniversalGenerateAction;
import cc.bitky.jetbrains.plugin.universalgenerate.constants.ActionEnum;
import cc.bitky.jetbrains.plugin.universalgenerate.factory.CommandCommandTypeProcessorFactory;
import cc.bitky.jetbrains.plugin.universalgenerate.pojo.WriteCommand;
import cc.bitky.jetbrains.plugin.universalgenerate.pojo.WriteContext;
import cc.bitky.jetbrains.plugin.universalgenerate.util.builder.WriteContextBuilder;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.command.WriteCommandAction;
import lombok.extern.slf4j.Slf4j;

/**
 * 在当前元素中强制重新生成所有注解
 *
 * @author bitkylin
 */
@Slf4j
public class ReGenerateGenerateForElementAction extends AbstractBitkylinUniversalGenerateAction {

    public ReGenerateGenerateForElementAction(String text) {
        super(text);
    }

    public ReGenerateGenerateForElementAction() {
        super();
    }

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        WriteContext writeContext = WriteContextBuilder.create(anActionEvent);

        WriteCommandAction.runWriteCommandAction(writeContext.fetchProject(), () -> {
            CommandCommandTypeProcessorFactory.decide(writeContext, WriteCommand.Command.RE_GENERATE_WRITE_SWAGGER).writeElement();
            CommandCommandTypeProcessorFactory.decide(writeContext, WriteCommand.Command.RE_GENERATE_WRITE_TAG).writeElement();
        });
    }

    @Override
    protected ActionEnum fetchActionEnum() {
        return ActionEnum.RE_GENERATE_ANNOTATION_FOR_ELEMENT;
    }
}