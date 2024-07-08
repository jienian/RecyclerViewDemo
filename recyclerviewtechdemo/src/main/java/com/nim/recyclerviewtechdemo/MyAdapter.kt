
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nim.recyclerviewtechdemo.Item
import com.nim.recyclerviewtechdemo.R
import java.util.Collections

/**
 * @author Nimyears
 */

class MyAdapter(items: List<Item?>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val items: List<Item?> = items

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View
        when (viewType) {
            0 -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_type_one, parent, false)
                return TypeOneViewHolder(view)
            }

            1 -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_type_two, parent, false)
                return TypeTwoViewHolder(view)
            }

            2 -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_type_three, parent, false)
                return TypeThreeViewHolder(view)
            }

            3 -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_type_four, parent, false)
                return TypeFourViewHolder(view)
            }

            4 -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_type_five, parent, false)
                return TypeFiveViewHolder(view)
            }

            5 -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_type_six, parent, false)
                return TypeSixViewHolder(view)
            }

            6 -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_type_seven, parent, false)
                return TypeSevenViewHolder(view)
            }

            7 -> {
                view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_type_eight, parent, false)
                return TypeEightViewHolder(view)
            }

            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        // Bind data to ViewHolder here if needed
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return items[position]?.type ?: 0
    }

    fun moveItem(fromPosition: Int, toPosition: Int) {
        if (fromPosition < toPosition) {
            for (i in fromPosition until toPosition) {
                Collections.swap(items, i, i + 1)
            }
        } else {
            for (i in fromPosition downTo toPosition + 1) {
                Collections.swap(items, i, i - 1)
            }
        }
        notifyItemMoved(fromPosition, toPosition)
    }

    internal class TypeOneViewHolder(itemView: View?) : RecyclerView.ViewHolder(
        itemView!!
    )

    internal class TypeTwoViewHolder(itemView: View?) : RecyclerView.ViewHolder(
        itemView!!
    )

    internal class TypeThreeViewHolder(itemView: View?) : RecyclerView.ViewHolder(
        itemView!!
    )

    internal class TypeFourViewHolder(itemView: View?) : RecyclerView.ViewHolder(
        itemView!!
    )

    internal class TypeFiveViewHolder(itemView: View?) : RecyclerView.ViewHolder(
        itemView!!
    )

    internal class TypeSixViewHolder(itemView: View?) : RecyclerView.ViewHolder(
        itemView!!
    )

    internal class TypeSevenViewHolder(itemView: View?) : RecyclerView.ViewHolder(
        itemView!!
    )

    internal class TypeEightViewHolder(itemView: View?) : RecyclerView.ViewHolder(
        itemView!!
    )
}