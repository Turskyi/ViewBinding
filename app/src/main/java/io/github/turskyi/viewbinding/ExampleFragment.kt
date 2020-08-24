package io.github.turskyi.viewbinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.github.turskyi.viewbinding.databinding.FragmentExampleBinding

class ExampleFragment : Fragment() {
    private var _binding: FragmentExampleBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExampleBinding.inflate(inflater, container, false)
        binding.fragmentTextView1.text = getString(R.string.fragment_text1)
        /* ? sign added because we do not have this view in the landscape mode */
        binding.fragmentTextView2?.text = getString(R.string.fragment_text2)
        binding.includeLayout.includeTextView1.text = getString(R.string.fragment_include_text1)
        binding.includeLayout.includeTextView2.text = getString(R.string.fragment_include_text2)
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
