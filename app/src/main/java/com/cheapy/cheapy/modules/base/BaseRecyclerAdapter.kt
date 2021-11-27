package david.angulo.cheapy.modules.base

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import java.util.*

/**
 * © Class created by David Angulo
 * */

abstract class BaseRecyclerAdapter<E, VH : BaseRecyclerAdapter.ViewHolder?> :
    RecyclerView.Adapter<VH> {
    var LOG_TAG = ""
    var list: List<E>
    private var inflater: LayoutInflater? = null

    constructor() {
        list = ArrayList()
        LOG_TAG = this.javaClass.simpleName
    }

    constructor(list: List<E>?) {
        var list = list
        if (list == null) {
            list = ArrayList()
        }
        this.list = list
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        onBindViewHolder(holder, position, getItem(position))
    }

    fun onBindViewHolder(holder: VH, position: Int, item: E) {
        holder?.bind(position)
    }

    // public abstract void onBindViewHolder(VH holder, int position, E item);
    override fun getItemCount(): Int {
        return list.size
    }

    private fun getItem(position: Int): E {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return list[position].hashCode().toLong()
    }


    protected fun getInflater(context: Context?): LayoutInflater? {
        if (inflater == null) {
            inflater = LayoutInflater.from(context)
        }
        return inflater
    }

    abstract class ViewHolder  // fun bind(position: Int) {
        (itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        abstract fun bind(position: Int)
    }
}