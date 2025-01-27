package cc.bitky.jetbrains.plugin.universalgenerate.action.intention;

import cc.bitky.jetbrains.plugin.universalgenerate.action.intention.base.AbstractUniversalGenerateIntentionAction;
import cc.bitky.jetbrains.plugin.universalgenerate.config.settings.state.GlobalSettingsStateHelper;
import cc.bitky.jetbrains.plugin.universalgenerate.constants.ActionEnum;
import cc.bitky.jetbrains.plugin.universalgenerate.constants.IntentionFamilyEnum;
import cc.bitky.jetbrains.plugin.universalgenerate.factory.CommandCommandTypeProcessorFactory;
import cc.bitky.jetbrains.plugin.universalgenerate.pojo.SelectWrapper;
import cc.bitky.jetbrains.plugin.universalgenerate.pojo.WriteCommand;
import cc.bitky.jetbrains.plugin.universalgenerate.pojo.WriteContext;
import cc.bitky.jetbrains.plugin.universalgenerate.util.DecisionUtils;
import cc.bitky.jetbrains.plugin.universalgenerate.util.builder.WriteContextIntentionBuilder;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;

/**
 * @author bitkylin
 */
@Slf4j
public class ReGenerateElementNameToJavaDocForFileIntentionAction extends AbstractUniversalGenerateIntentionAction {

    @Override
    protected boolean calcIsAvailable(@NotNull Project project, Editor editor, @NotNull PsiElement element) {
        if (!GlobalSettingsStateHelper.getInstance().isIntentionReGenerateShowed()) {
            return false;
        }
        SelectWrapper selectWrapper = DecisionUtils.parseSelectWrapper(project, element);
        return !selectWrapper.isSelected();
    }

    @Override
    protected void doInvoke(@NotNull Project project, Editor editor, @NotNull PsiElement element) {
        WriteContext writeContext = WriteContextIntentionBuilder.create(project, editor, element);
        CommandCommandTypeProcessorFactory.decide(writeContext, WriteCommand.Command.RE_GENERATE_ELEMENT_NAME_TO_JAVA_DOC).writeFile();
    }

    @Override
    protected IntentionFamilyEnum fetchIntentionFamilyEnum() {
        return IntentionFamilyEnum.SEARCH_ELEMENT_NAME_TO_JAVA_DOC;
    }

    @Override
    protected ActionEnum fetchActionEnum() {
        return ActionEnum.RE_GENERATE_ELEMENT_NAME_TO_JAVA_DOC_FOR_FILE;
    }
}
