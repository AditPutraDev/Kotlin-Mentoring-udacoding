package id.mentoring.kotlin2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.mentoring.kotlin2.R
import id.mentoring.kotlin2.models.Hero
import kotlinx.android.synthetic.main.item_hero.view.*

class ListHeroAdapter(private val listHero: ArrayList<Hero>) : RecyclerView.Adapter<ListHeroAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_hero, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listHero.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = listHero[position]
        holder.bind(hero)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(hero: Hero) {
            Glide.with(itemView.context)
                .load(hero.photo)
                .apply(RequestOptions().override(55, 55))
                .into(itemView.img_item_photo)
            itemView.tv_item_name.text = hero.name
            itemView.tv_item_detail.text = hero.detail

        }
    }

}