package com.wms.fragment;

import java.util.List;

import com.wms.activity.R;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.*;;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class ItemListFragment<T> extends Fragment{
	private RecyclerView recyclerView;
	private ListAdapter<T> adapter;
	@Override 
	public View onCreatView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.fragment_recycler_view, container,false);//false表示这里不把视图加到父activity中，在singlefragment中加
		recyclerView=(RecyclerView)view.findViewById(R.id.recycler_view);
		recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
		updateUI();
		return view;
	}
	
	//TODO need consider, how can differenr list came in
		
	
	protected abstract void updateUI();
	/*{
	 * 	List<T> list=getList();
	 * 	adapter=new ListAdapter(list);
	 * 	recyclerView.setAdapter(adapter);
	 *}
	 * */
	
	//viewholder承接view
	private class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
		private T mt;
		private TextView idTextView;//TODO can change according to T?
		private TextView infoTextView;
		private TextView stateTextView;
		private TextView dateTextView; 
		public ItemHolder(LayoutInflater inflater, ViewGroup parent){
			super(inflater.inflate(R.layout.fragment_item_list, parent,false));
			itemView.setOnClickListener(this);
			//itemView is a field that super class assgined, contains a reference to the entire view
			idTextView=(TextView)itemView.findViewById(R.id.item_id);
		}
		
		public void bind(T t) {
			mt=t;
			idTextView.setText(mt.getId());//get the first element
		}
		
		@Override
		public void OnClick(View view) {
			//TODO how to get T's name 
			Intent intent=new Intent(getActivity(),TActivity.class);
			startAvctivity(intent);
		}
	}
	
	//recyclerview 通过adapter和viewholder进行沟通（创建，获取等）
	private class ListAdapter extends RecyclerView.Adapter<ItemHolder>{
		private List<T> list;
		public ListAdapter(List<T> l){
			list=l;
		}
		
		//this will be called if recyclerview needs viewholder to display an item
		@Override
		public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType){
			LayoutInflater layoutInflater=LayoutInflater.from(getActivity());
			return new ItemHolder(layoutInflater, parent);
		}
		
		@Override
		public void onBindViewHolder(ItemHolder holder, int position){
			T t=list.get(position);
			holder.bind(t);
		}
		
		@Override
		public int getItemCount(){
			return list.size();
		}
	}
}

