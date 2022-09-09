public class ChunckOptionPopupPanel {


private boolean has(String key)
   {
      return chunkOptions_.containsKey(key);
   }

   public String get(String key)
   {
      return chunkOptions_.get(key);
   }

   private boolean getBoolean(String key)
   {
      return isTrue(chunkOptions_.get(key));
   }

   private void set(String key, String value)
   {
      chunkOptions_.put(key,  value);
   }

   private void unset(String key)
   {
      chunkOptions_.remove(key);
   }

   public void init(AceEditorWidget widget, Position position)
   {
      widget_ = widget;
      position_ = position;
      chunkOptions_.clear();

      originalLine_ = widget_.getEditor().getSession().getLine(position_.getRow());
      parseChunkHeader(originalLine_, chunkOptions_);

      for (Map.Entry<String, String> pair : originalChunkOptions_.entrySet())
        {
        boolean truthy = false;

        if (has("fig.width")) {
            truthy = getBoolean("fig.width");
        }
        if (has("fig.height")) {
            truthy = getBoolean("fig.height")
        }
      }
}
}