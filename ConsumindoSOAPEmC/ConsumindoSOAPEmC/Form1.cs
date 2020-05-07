using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Drawing.Printing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ConsumindoSOAPEmC
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {

            ServicoValidador.ValidadorServerImpService servico = new ServicoValidador.ValidadorServerImpService();
            MessageBox.Show(servico.valida("545687-85"));
            MessageBox.Show(servico.valida("5456887-85"));
            MessageBox.Show(servico.valida("54687-85"));
        }
    }
}
