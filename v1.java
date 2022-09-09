public class ChunckOptionPopupPanel {

public void init(AceEditorWidget widget, Position position)
   {
      widget_ = widget;
      position_ = position;
      chunkOptions_.clear();

      originalLine_ = widget_.getEditor().getSession().getLine(position_.getRow());
      parseChunkHeader(originalLine_, chunkOptions_);

      for (String option : BOOLEAN_CHUNK_OPTIONS.keySet())
      {
         if (chunkOptions_.containsKey(option))
         {
            boolean truthy = isTrue(chunkOptions_.get(option));
            if (truthy)
               cb.setState(TriStateCheckBox.STATE_ON);
            else
               cb.setState(TriStateCheckBox.STATE_OFF);
         }
         else
         {
            cb.setState(TriStateCheckBox.STATE_INDETERMINATE);
         }
      }
   }
}