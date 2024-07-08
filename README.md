# RecyclerViewDemo

## RecyclerViewTouchDemo功能实现

### 实现RecyclerView的高级交互功能，按选择和拖放排序。

## 长按和拖放操作
通过自定义ItemTouchHelper.Callback，为RecyclerView添加了长按拖放功能，利用onMove和getMovementFlags方法精确控制拖动行为。

## 拖动排序逻辑
- **onMove**：重写此方法以在拖动时交换列表项的位置，更新适配器数据源。
- **getMovementFlags**：在此方法中定义可拖动的方向，为每个列表项设置适当的拖动标志。
