class Solution {
  public String simplifyPath(String path) {
      Stack<String> stack = new Stack<>();
      String[] arr = path.split("/");

      for(String str : arr) {
          if(str.equals("") || str.equals(".")) continue;
          if(str.equals("..")) {
              if(!stack.isEmpty()) {
                  stack.pop();
              }
          }
          else {
              stack.push(str);
          }
      }

      StringBuilder sb = new StringBuilder();

      for(String dir : stack) {
          sb.append("/").append(dir);
      }

      String res = sb.toString();
      return res.length() > 0 ? res : "/";
  }
}